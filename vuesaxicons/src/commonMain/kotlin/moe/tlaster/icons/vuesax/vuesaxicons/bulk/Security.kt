package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = Builder(name = "Security", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3301f, 5.67f)
                lineTo(6.5901f, 17.41f)
                curveTo(6.1501f, 17.85f, 5.4101f, 17.79f, 5.0501f, 17.27f)
                curveTo(3.8101f, 15.46f, 3.0801f, 13.32f, 3.0801f, 11.12f)
                verticalLineTo(6.73f)
                curveTo(3.0801f, 5.91f, 3.7001f, 4.98f, 4.4601f, 4.67f)
                lineTo(10.0301f, 2.39f)
                curveTo(11.2901f, 1.87f, 12.6901f, 1.87f, 13.9501f, 2.39f)
                lineTo(17.9901f, 4.04f)
                curveTo(18.6601f, 4.31f, 18.8301f, 5.17f, 18.3301f, 5.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.27f, 7.0401f)
                curveTo(19.92f, 6.4901f, 20.91f, 6.9601f, 20.91f, 7.8101f)
                verticalLineTo(11.1201f)
                curveTo(20.91f, 16.0101f, 17.36f, 20.5901f, 12.51f, 21.9301f)
                curveTo(12.18f, 22.0201f, 11.82f, 22.0201f, 11.48f, 21.9301f)
                curveTo(10.06f, 21.5301f, 8.74f, 20.8601f, 7.61f, 19.9801f)
                curveTo(7.13f, 19.6101f, 7.08f, 18.9101f, 7.5f, 18.4801f)
                curveTo(9.68f, 16.2501f, 16.06f, 9.7501f, 19.27f, 7.0401f)
                close()
            }
        }
        .build()
        return _security!!
    }

private var _security: ImageVector? = null
