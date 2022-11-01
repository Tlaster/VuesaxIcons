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

public val LinearGroup.Moneys: ImageVector
    get() {
        if (_moneys != null) {
            return _moneys!!
        }
        _moneys = Builder(name = "Moneys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3f, 7.92f)
                verticalLineTo(13.07f)
                curveTo(19.3f, 16.15f, 17.54f, 17.47f, 14.9f, 17.47f)
                horizontalLineTo(6.11f)
                curveTo(5.6599f, 17.47f, 5.23f, 17.43f, 4.83f, 17.34f)
                curveTo(4.58f, 17.3f, 4.34f, 17.23f, 4.12f, 17.15f)
                curveTo(2.62f, 16.59f, 1.71f, 15.29f, 1.71f, 13.07f)
                verticalLineTo(7.92f)
                curveTo(1.71f, 4.84f, 3.4699f, 3.52f, 6.11f, 3.52f)
                horizontalLineTo(14.9f)
                curveTo(17.14f, 3.52f, 18.75f, 4.47f, 19.18f, 6.64f)
                curveTo(19.25f, 7.04f, 19.3f, 7.45f, 19.3f, 7.92f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.3011f, 10.9201f)
                verticalLineTo(16.0701f)
                curveTo(22.3011f, 19.1501f, 20.5411f, 20.4701f, 17.9011f, 20.4701f)
                horizontalLineTo(9.111f)
                curveTo(8.371f, 20.4701f, 7.7011f, 20.3701f, 7.1211f, 20.1501f)
                curveTo(5.9311f, 19.7101f, 5.121f, 18.8001f, 4.831f, 17.3401f)
                curveTo(5.2311f, 17.4301f, 5.661f, 17.4701f, 6.1111f, 17.4701f)
                horizontalLineTo(14.9011f)
                curveTo(17.5411f, 17.4701f, 19.3011f, 16.1501f, 19.3011f, 13.0701f)
                verticalLineTo(7.9201f)
                curveTo(19.3011f, 7.4501f, 19.2611f, 7.0301f, 19.1811f, 6.6401f)
                curveTo(21.0811f, 7.0401f, 22.3011f, 8.3801f, 22.3011f, 10.9201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4984f, 13.1399f)
                curveTo(11.9564f, 13.1399f, 13.1384f, 11.9579f, 13.1384f, 10.4999f)
                curveTo(13.1384f, 9.0419f, 11.9564f, 7.8599f, 10.4984f, 7.8599f)
                curveTo(9.0404f, 7.8599f, 7.8584f, 9.0419f, 7.8584f, 10.4999f)
                curveTo(7.8584f, 11.9579f, 9.0404f, 13.1399f, 10.4984f, 13.1399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.78f, 8.3f)
                verticalLineTo(12.7001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2217f, 8.3003f)
                verticalLineTo(12.7003f)
            }
        }
        .build()
        return _moneys!!
    }

private var _moneys: ImageVector? = null
