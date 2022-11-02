package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Volumecross: ImageVector
    get() {
        if (_volumecross != null) {
            return _volumecross!!
        }
        _volumecross = Builder(name = "Volumecross", defaultWidth = 22.0.dp, defaultHeight =
                18.0.dp, viewportWidth = 22.0f, viewportHeight = 18.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 7.0008f)
                verticalLineTo(11.0008f)
                curveTo(1.0f, 13.0008f, 2.0f, 14.0008f, 4.0f, 14.0008f)
                horizontalLineTo(5.43f)
                curveTo(5.8f, 14.0008f, 6.17f, 14.1108f, 6.49f, 14.3008f)
                lineTo(9.41f, 16.1308f)
                curveTo(11.93f, 17.7108f, 14.0f, 16.5608f, 14.0f, 13.5908f)
                verticalLineTo(4.4108f)
                curveTo(14.0f, 1.4308f, 11.93f, 0.2908f, 9.41f, 1.8708f)
                lineTo(6.49f, 3.7008f)
                curveTo(6.17f, 3.8908f, 5.8f, 4.0008f, 5.43f, 4.0008f)
                horizontalLineTo(4.0f)
                curveTo(2.0f, 4.0008f, 1.0f, 5.0008f, 1.0f, 7.0008f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9991f, 10.961f)
                lineTo(17.0391f, 7.001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.96f, 7.041f)
                lineTo(17.0f, 11.001f)
            }
        }
        .build()
        return _volumecross!!
    }

private var _volumecross: ImageVector? = null
