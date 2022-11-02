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

public val BulkGroup.Danger: ImageVector
    get() {
        if (_danger != null) {
            return _danger!!
        }
        _danger = Builder(name = "Danger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.7605f, 15.92f)
                lineTo(15.3605f, 4.4f)
                curveTo(14.5005f, 2.85f, 13.3105f, 2.0f, 12.0005f, 2.0f)
                curveTo(10.6905f, 2.0f, 9.5005f, 2.85f, 8.6405f, 4.4f)
                lineTo(2.2405f, 15.92f)
                curveTo(1.4305f, 17.39f, 1.3405f, 18.8f, 1.9905f, 19.91f)
                curveTo(2.6405f, 21.02f, 3.9205f, 21.63f, 5.6005f, 21.63f)
                horizontalLineTo(18.4005f)
                curveTo(20.0805f, 21.63f, 21.3605f, 21.02f, 22.0105f, 19.91f)
                curveTo(22.6605f, 18.8f, 22.5705f, 17.38f, 21.7605f, 15.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.59f, 11.59f, 8.25f, 12.0f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12.0f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0001f)
                curveTo(11.94f, 18.0001f, 11.87f, 17.9901f, 11.8f, 17.9801f)
                curveTo(11.74f, 17.9701f, 11.68f, 17.9501f, 11.62f, 17.9201f)
                curveTo(11.56f, 17.9001f, 11.5f, 17.8701f, 11.44f, 17.8301f)
                curveTo(11.39f, 17.7901f, 11.34f, 17.7501f, 11.29f, 17.7101f)
                curveTo(11.11f, 17.5201f, 11.0f, 17.2601f, 11.0f, 17.0001f)
                curveTo(11.0f, 16.7401f, 11.11f, 16.4801f, 11.29f, 16.2901f)
                curveTo(11.34f, 16.2501f, 11.39f, 16.2101f, 11.44f, 16.1701f)
                curveTo(11.5f, 16.1301f, 11.56f, 16.1001f, 11.62f, 16.0801f)
                curveTo(11.68f, 16.0501f, 11.74f, 16.0301f, 11.8f, 16.0201f)
                curveTo(11.93f, 15.9901f, 12.07f, 15.9901f, 12.19f, 16.0201f)
                curveTo(12.26f, 16.0301f, 12.32f, 16.0501f, 12.38f, 16.0801f)
                curveTo(12.44f, 16.1001f, 12.5f, 16.1301f, 12.56f, 16.1701f)
                curveTo(12.61f, 16.2101f, 12.66f, 16.2501f, 12.71f, 16.2901f)
                curveTo(12.89f, 16.4801f, 13.0f, 16.7401f, 13.0f, 17.0001f)
                curveTo(13.0f, 17.2601f, 12.89f, 17.5201f, 12.71f, 17.7101f)
                curveTo(12.66f, 17.7501f, 12.61f, 17.7901f, 12.56f, 17.8301f)
                curveTo(12.5f, 17.8701f, 12.44f, 17.9001f, 12.38f, 17.9201f)
                curveTo(12.32f, 17.9501f, 12.26f, 17.9701f, 12.19f, 17.9801f)
                curveTo(12.13f, 17.9901f, 12.06f, 18.0001f, 12.0f, 18.0001f)
                close()
            }
        }
        .build()
        return _danger!!
    }

private var _danger: ImageVector? = null
