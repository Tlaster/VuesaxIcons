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

public val BulkGroup.Computing: ImageVector
    get() {
        if (_computing != null) {
            return _computing!!
        }
        _computing = Builder(name = "Computing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.83f, 19.83f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(7.81f)
                curveTo(6.32f, 22.0f, 5.08f, 21.64f, 4.13f, 20.95f)
                curveTo(3.71f, 20.66f, 3.34f, 20.29f, 3.05f, 19.87f)
                curveTo(2.36f, 18.92f, 2.0f, 17.68f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(17.68f, 2.0f, 18.92f, 2.36f, 19.87f, 3.05f)
                curveTo(20.29f, 3.34f, 20.66f, 3.71f, 20.95f, 4.13f)
                curveTo(21.64f, 5.08f, 22.0f, 6.32f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9508f, 4.1301f)
                lineTo(4.1308f, 20.9501f)
                curveTo(3.7108f, 20.66f, 3.3408f, 20.2901f, 3.0508f, 19.8701f)
                lineTo(19.8708f, 3.0501f)
                curveTo(20.2908f, 3.34f, 20.6608f, 3.7101f, 20.9508f, 4.1301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 14.75f)
                horizontalLineTo(16.81f)
                verticalLineTo(13.0f)
                curveTo(16.81f, 12.59f, 16.47f, 12.25f, 16.06f, 12.25f)
                curveTo(15.65f, 12.25f, 15.31f, 12.59f, 15.31f, 13.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(13.5f)
                curveTo(13.09f, 14.75f, 12.75f, 15.09f, 12.75f, 15.5f)
                curveTo(12.75f, 15.91f, 13.09f, 16.25f, 13.5f, 16.25f)
                horizontalLineTo(15.31f)
                verticalLineTo(18.0f)
                curveTo(15.31f, 18.41f, 15.65f, 18.75f, 16.06f, 18.75f)
                curveTo(16.47f, 18.75f, 16.81f, 18.41f, 16.81f, 18.0f)
                verticalLineTo(16.25f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 16.25f, 19.25f, 15.91f, 19.25f, 15.5f)
                curveTo(19.25f, 15.09f, 18.91f, 14.75f, 18.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 8.25f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 8.25f, 4.75f, 7.91f, 4.75f, 7.5f)
                curveTo(4.75f, 7.09f, 5.09f, 6.75f, 5.5f, 6.75f)
                horizontalLineTo(10.5f)
                curveTo(10.91f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91f, 10.91f, 8.25f, 10.5f, 8.25f)
                close()
            }
        }
        .build()
        return _computing!!
    }

private var _computing: ImageVector? = null
