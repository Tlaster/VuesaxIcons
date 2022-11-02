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

public val TwotoneGroup.Airdrop: ImageVector
    get() {
        if (_airdrop != null) {
            return _airdrop!!
        }
        _airdrop = Builder(name = "Airdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1297f, 11.3401f)
                curveTo(14.5197f, 9.7001f, 13.0897f, 8.27f, 11.4497f, 8.66f)
                curveTo(10.6797f, 8.85f, 10.0497f, 9.4801f, 9.8597f, 10.2501f)
                curveTo(9.4697f, 11.8901f, 10.8997f, 13.32f, 12.5397f, 12.93f)
                curveTo(13.3197f, 12.74f, 13.9497f, 12.1101f, 14.1297f, 11.3401f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0099f, 17.19f)
                curveTo(19.7199f, 15.59f, 20.7899f, 13.32f, 20.7899f, 10.79f)
                curveTo(20.7899f, 5.93f, 16.85f, 2.0f, 12.0f, 2.0f)
                curveTo(7.15f, 2.0f, 3.21f, 5.94f, 3.21f, 10.79f)
                curveTo(3.21f, 13.33f, 4.29f, 15.62f, 6.02f, 17.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9998f, 14.5498f)
                curveTo(7.0798f, 13.5698f, 6.5098f, 12.2498f, 6.5098f, 10.7898f)
                curveTo(6.5098f, 7.7598f, 8.9698f, 5.2998f, 11.9998f, 5.2998f)
                curveTo(15.0298f, 5.2998f, 17.4898f, 7.7598f, 17.4898f, 10.7898f)
                curveTo(17.4898f, 12.2498f, 16.9198f, 13.5598f, 15.9998f, 14.5498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2997f, 16.6598f)
                lineTo(8.8597f, 18.4498f)
                curveTo(7.7197f, 19.8798f, 8.7297f, 21.9898f, 10.5597f, 21.9898f)
                horizontalLineTo(13.4297f)
                curveTo(15.2597f, 21.9898f, 16.2797f, 19.8698f, 15.1297f, 18.4498f)
                lineTo(13.6897f, 16.6598f)
                curveTo(12.8297f, 15.5698f, 11.1697f, 15.5698f, 10.2997f, 16.6598f)
                close()
            }
        }
        .build()
        return _airdrop!!
    }

private var _airdrop: ImageVector? = null
