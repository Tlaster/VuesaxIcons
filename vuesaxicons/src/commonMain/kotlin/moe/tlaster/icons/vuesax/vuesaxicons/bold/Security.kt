package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = Builder(name = "Security", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3281f, 5.67f)
                lineTo(6.5881f, 17.41f)
                curveTo(6.1481f, 17.85f, 5.4081f, 17.79f, 5.0481f, 17.27f)
                curveTo(3.8081f, 15.46f, 3.0781f, 13.32f, 3.0781f, 11.12f)
                verticalLineTo(6.73f)
                curveTo(3.0781f, 5.91f, 3.6981f, 4.98f, 4.4581f, 4.67f)
                lineTo(10.0281f, 2.39f)
                curveTo(11.2881f, 1.87f, 12.6881f, 1.87f, 13.9481f, 2.39f)
                lineTo(17.9981f, 4.04f)
                curveTo(18.6581f, 4.31f, 18.8281f, 5.17f, 18.3281f, 5.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.27f, 7.0416f)
                curveTo(19.92f, 6.4916f, 20.91f, 6.9616f, 20.91f, 7.8116f)
                verticalLineTo(11.1216f)
                curveTo(20.91f, 16.0116f, 17.36f, 20.5916f, 12.51f, 21.9316f)
                curveTo(12.18f, 22.0216f, 11.82f, 22.0216f, 11.48f, 21.9316f)
                curveTo(10.06f, 21.5316f, 8.74f, 20.8616f, 7.61f, 19.9816f)
                curveTo(7.13f, 19.6116f, 7.08f, 18.9116f, 7.5f, 18.4816f)
                curveTo(9.68f, 16.2516f, 16.06f, 9.7516f, 19.27f, 7.0416f)
                close()
            }
        }
        .build()
        return _security!!
    }

private var _security: ImageVector? = null
