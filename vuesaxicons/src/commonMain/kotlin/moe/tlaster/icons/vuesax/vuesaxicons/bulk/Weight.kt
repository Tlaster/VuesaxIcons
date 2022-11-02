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

public val BulkGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 22.0f, 21.0f, 20.0f, 21.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 4.0f, 19.0f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 2.0f, 3.0f, 4.0f, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 20.0f, 5.0f, 22.0f, 8.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 8.0f)
                curveTo(14.37f, 5.21f, 9.64f, 5.21f, 6.5f, 8.0f)
                curveTo(6.36f, 8.13f, 6.33f, 8.33f, 6.43f, 8.48f)
                lineTo(8.61f, 11.98f)
                curveTo(8.67f, 12.07f, 8.77f, 12.14f, 8.87f, 12.15f)
                curveTo(8.98f, 12.17f, 9.09f, 12.13f, 9.17f, 12.06f)
                curveTo(10.78f, 10.63f, 13.2f, 10.63f, 14.81f, 12.06f)
                curveTo(14.88f, 12.12f, 14.97f, 12.15f, 15.06f, 12.15f)
                curveTo(15.08f, 12.15f, 15.1f, 12.15f, 15.11f, 12.15f)
                curveTo(15.22f, 12.13f, 15.32f, 12.07f, 15.37f, 11.98f)
                lineTo(17.55f, 8.48f)
                curveTo(17.67f, 8.33f, 17.64f, 8.13f, 17.5f, 8.0f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
