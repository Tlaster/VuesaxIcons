package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Ticketstar: ImageVector
    get() {
        if (_ticketstar != null) {
            return _ticketstar!!
        }
        _ticketstar = Builder(name = "Ticketstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9959f, 4.0f)
                horizontalLineTo(6.9959f)
                curveTo(3.1659f, 4.0f, 2.0959f, 4.92f, 2.0059f, 8.5f)
                curveTo(3.9359f, 8.5f, 5.4959f, 10.07f, 5.4959f, 12.0f)
                curveTo(5.4959f, 13.93f, 3.9359f, 15.49f, 2.0059f, 15.5f)
                curveTo(2.0959f, 19.08f, 3.1659f, 20.0f, 6.9959f, 20.0f)
                horizontalLineTo(16.9959f)
                curveTo(20.9959f, 20.0f, 21.9959f, 19.0f, 21.9959f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.9959f, 5.0f, 20.9959f, 4.0f, 16.9959f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9941f, 4.0f)
                verticalLineTo(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9941f, 16.5f)
                verticalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.024f, 9.3302f)
                lineTo(15.644f, 10.5802f)
                curveTo(15.704f, 10.7002f, 15.824f, 10.7902f, 15.954f, 10.8102f)
                lineTo(17.334f, 11.0102f)
                curveTo(17.674f, 11.0602f, 17.814f, 11.4802f, 17.564f, 11.7202f)
                lineTo(16.564f, 12.6902f)
                curveTo(16.464f, 12.7802f, 16.424f, 12.9202f, 16.444f, 13.0602f)
                lineTo(16.684f, 14.4302f)
                curveTo(16.744f, 14.7702f, 16.384f, 15.0302f, 16.084f, 14.8702f)
                lineTo(14.854f, 14.2202f)
                curveTo(14.734f, 14.1602f, 14.584f, 14.1602f, 14.464f, 14.2202f)
                lineTo(13.234f, 14.8702f)
                curveTo(12.924f, 15.0302f, 12.574f, 14.7702f, 12.634f, 14.4302f)
                lineTo(12.874f, 13.0602f)
                curveTo(12.894f, 12.9202f, 12.854f, 12.7902f, 12.754f, 12.6902f)
                lineTo(11.764f, 11.7202f)
                curveTo(11.514f, 11.4802f, 11.654f, 11.0602f, 11.994f, 11.0102f)
                lineTo(13.374f, 10.8102f)
                curveTo(13.514f, 10.7902f, 13.624f, 10.7102f, 13.684f, 10.5802f)
                lineTo(14.294f, 9.3302f)
                curveTo(14.434f, 9.0202f, 14.874f, 9.0202f, 15.024f, 9.3302f)
                close()
            }
        }
        .build()
        return _ticketstar!!
    }

private var _ticketstar: ImageVector? = null
