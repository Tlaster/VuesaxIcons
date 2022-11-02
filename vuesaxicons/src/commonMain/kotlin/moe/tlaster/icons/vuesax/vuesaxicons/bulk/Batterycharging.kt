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

public val BulkGroup.Batterycharging: ImageVector
    get() {
        if (_batterycharging != null) {
            return _batterycharging!!
        }
        _batterycharging = Builder(name = "Batterycharging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.93f, 4.79f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 4.79f, 2.0f, 6.04f, 2.0f, 10.14f)
                verticalLineTo(13.86f)
                curveTo(2.0f, 17.96f, 3.25f, 19.21f, 7.35f, 19.21f)
                horizontalLineTo(12.93f)
                curveTo(17.03f, 19.21f, 18.28f, 17.96f, 18.28f, 13.86f)
                verticalLineTo(10.14f)
                curveTo(18.28f, 6.04f, 17.03f, 4.79f, 12.93f, 4.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4192f, 9.0f)
                curveTo(20.2792f, 8.99f, 20.0992f, 8.98f, 19.8992f, 8.98f)
                curveTo(19.5092f, 8.98f, 19.1992f, 9.29f, 19.1992f, 9.68f)
                verticalLineTo(14.33f)
                curveTo(19.1992f, 14.72f, 19.5092f, 15.03f, 19.8992f, 15.03f)
                curveTo(20.0992f, 15.03f, 20.2692f, 15.02f, 20.4392f, 15.01f)
                curveTo(21.9992f, 14.83f, 21.9992f, 13.73f, 21.9992f, 12.93f)
                verticalLineTo(11.07f)
                curveTo(21.9992f, 10.27f, 21.9992f, 9.17f, 20.4192f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0097f, 16.24f)
                curveTo(9.8397f, 16.24f, 9.6597f, 16.18f, 9.5197f, 16.06f)
                curveTo(9.2097f, 15.79f, 9.1697f, 15.32f, 9.4397f, 15.0f)
                lineTo(11.2397f, 12.89f)
                curveTo(11.2497f, 12.86f, 11.2397f, 12.83f, 11.2197f, 12.8f)
                curveTo(11.1997f, 12.76f, 11.1597f, 12.74f, 11.1097f, 12.74f)
                horizontalLineTo(9.1197f)
                curveTo(8.5297f, 12.74f, 8.0097f, 12.44f, 7.7097f, 11.93f)
                curveTo(7.4197f, 11.42f, 7.4197f, 10.82f, 7.7097f, 10.31f)
                lineTo(9.4197f, 8.05f)
                curveTo(9.6697f, 7.72f, 10.1397f, 7.65f, 10.4697f, 7.9f)
                curveTo(10.7997f, 8.15f, 10.8697f, 8.62f, 10.6197f, 8.95f)
                lineTo(8.9697f, 11.14f)
                curveTo(8.9997f, 11.1f, 8.9997f, 11.14f, 9.0197f, 11.19f)
                curveTo(9.0397f, 11.23f, 9.0797f, 11.25f, 9.1297f, 11.25f)
                horizontalLineTo(11.1397f)
                curveTo(11.7297f, 11.25f, 12.2497f, 11.55f, 12.5497f, 12.06f)
                curveTo(12.8397f, 12.57f, 12.8397f, 13.17f, 12.5497f, 13.68f)
                curveTo(12.5297f, 13.72f, 12.4997f, 13.76f, 12.4697f, 13.79f)
                lineTo(10.5997f, 15.98f)
                curveTo(10.4397f, 16.16f, 10.2297f, 16.24f, 10.0097f, 16.24f)
                close()
            }
        }
        .build()
        return _batterycharging!!
    }

private var _batterycharging: ImageVector? = null
