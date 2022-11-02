package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Airdrop: ImageVector
    get() {
        if (_airdrop != null) {
            return _airdrop!!
        }
        _airdrop = Builder(name = "Airdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5495f, 12.9201f)
                curveTo(10.9095f, 13.3101f, 9.4795f, 11.8801f, 9.8695f, 10.2401f)
                curveTo(10.0595f, 9.4701f, 10.6895f, 8.8401f, 11.4595f, 8.6501f)
                curveTo(12.8095f, 8.3201f, 14.0295f, 9.2501f, 14.1895f, 10.5001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.6409f, 3.1499f)
                curveTo(4.9909f, 4.6599f, 3.2109f, 7.5199f, 3.2109f, 10.7899f)
                curveTo(3.2109f, 13.3299f, 4.2909f, 15.6198f, 6.0209f, 17.2198f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.01f, 17.19f)
                curveTo(19.72f, 15.59f, 20.79f, 13.32f, 20.79f, 10.79f)
                curveTo(20.79f, 5.93f, 16.85f, 2.0f, 12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9998f, 14.55f)
                curveTo(7.0798f, 13.57f, 6.5098f, 12.25f, 6.5098f, 10.79f)
                curveTo(6.5098f, 7.76f, 8.9698f, 5.3f, 11.9998f, 5.3f)
                curveTo(15.0298f, 5.3f, 17.4898f, 7.76f, 17.4898f, 10.79f)
                curveTo(17.4898f, 12.25f, 16.9198f, 13.56f, 15.9998f, 14.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3007f, 16.66f)
                lineTo(8.8607f, 18.4501f)
                curveTo(7.7207f, 19.8801f, 8.7307f, 21.99f, 10.5607f, 21.99f)
                horizontalLineTo(13.4307f)
                curveTo(15.2607f, 21.99f, 16.2807f, 19.8701f, 15.1307f, 18.4501f)
                lineTo(13.6907f, 16.66f)
                curveTo(12.8307f, 15.57f, 11.1707f, 15.57f, 10.3007f, 16.66f)
                close()
            }
        }
        .build()
        return _airdrop!!
    }

private var _airdrop: ImageVector? = null
