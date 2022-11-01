package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Airdrop: ImageVector
    get() {
        if (_airdrop != null) {
            return _airdrop!!
        }
        _airdrop = Builder(name = "Airdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.13f, 11.3401f)
                curveTo(14.52f, 9.7001f, 13.09f, 8.27f, 11.45f, 8.66f)
                curveTo(10.68f, 8.85f, 10.05f, 9.4801f, 9.86f, 10.2501f)
                curveTo(9.47f, 11.8901f, 10.9f, 13.32f, 12.54f, 12.93f)
                curveTo(13.32f, 12.74f, 13.95f, 12.1101f, 14.13f, 11.3401f)
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
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.55f)
                curveTo(7.08f, 13.57f, 6.51f, 12.25f, 6.51f, 10.79f)
                curveTo(6.51f, 7.76f, 8.97f, 5.3f, 12.0f, 5.3f)
                curveTo(15.03f, 5.3f, 17.49f, 7.76f, 17.49f, 10.79f)
                curveTo(17.49f, 12.25f, 16.92f, 13.56f, 16.0f, 14.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.3f, 16.66f)
                lineTo(8.86f, 18.4501f)
                curveTo(7.72f, 19.8801f, 8.73f, 21.99f, 10.56f, 21.99f)
                horizontalLineTo(13.43f)
                curveTo(15.26f, 21.99f, 16.28f, 19.8701f, 15.13f, 18.4501f)
                lineTo(13.69f, 16.66f)
                curveTo(12.83f, 15.57f, 11.17f, 15.57f, 10.3f, 16.66f)
                close()
            }
        }
        .build()
        return _airdrop!!
    }

private var _airdrop: ImageVector? = null
