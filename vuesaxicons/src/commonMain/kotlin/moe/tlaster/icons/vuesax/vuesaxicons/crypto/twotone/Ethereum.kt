package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = Builder(name = "Ethereum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4504f, 3.0501f)
                lineTo(6.7204f, 7.7101f)
                curveTo(5.8704f, 8.7701f, 6.1704f, 10.1301f, 7.3804f, 10.7301f)
                lineTo(11.1104f, 12.6001f)
                curveTo(11.6004f, 12.8401f, 12.4004f, 12.8401f, 12.8904f, 12.6001f)
                lineTo(16.6204f, 10.7301f)
                curveTo(17.8304f, 10.1201f, 18.1304f, 8.7601f, 17.2804f, 7.7101f)
                lineTo(13.5504f, 3.0501f)
                curveTo(12.7004f, 1.9801f, 11.3004f, 1.9801f, 10.4504f, 3.0501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.2998f)
                verticalLineTo(7.5598f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.7998f, 10.7101f)
                lineTo(11.9998f, 7.5601f)
                lineTo(16.1998f, 10.7101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7701f, 14.4301f)
                lineTo(10.3801f, 15.1501f)
                curveTo(11.4101f, 15.6101f, 12.5901f, 15.6101f, 13.6301f, 15.1501f)
                lineTo(15.2401f, 14.4301f)
                curveTo(16.6801f, 13.7901f, 18.0101f, 15.5301f, 17.0101f, 16.7501f)
                lineTo(13.5501f, 20.9801f)
                curveTo(12.7001f, 22.0201f, 11.3101f, 22.0201f, 10.4501f, 20.9801f)
                lineTo(7.0001f, 16.7501f)
                curveTo(5.9901f, 15.5301f, 7.3201f, 13.7901f, 8.7701f, 14.4301f)
                close()
            }
        }
        .build()
        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
