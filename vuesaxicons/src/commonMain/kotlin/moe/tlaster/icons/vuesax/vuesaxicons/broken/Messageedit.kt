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

public val BrokenGroup.Messageedit: ImageVector
    get() {
        if (_messageedit != null) {
            return _messageedit!!
        }
        _messageedit = Builder(name = "Messageedit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 8.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 16.0f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5108f, 11.7401f)
                lineTo(16.1608f, 11.0901f)
                curveTo(16.2008f, 11.0501f, 16.2408f, 11.0101f, 16.2808f, 10.9601f)
                curveTo(17.0908f, 10.1001f, 17.4108f, 9.0901f, 16.1608f, 7.8401f)
                curveTo(14.8408f, 6.5201f, 13.8008f, 6.9501f, 12.9108f, 7.8401f)
                lineTo(7.7208f, 13.0301f)
                curveTo(7.5208f, 13.2301f, 7.3308f, 13.6201f, 7.2908f, 13.9001f)
                lineTo(7.0108f, 15.8801f)
                curveTo(6.9108f, 16.6001f, 7.4108f, 17.1001f, 8.1308f, 17.0001f)
                lineTo(10.1108f, 16.7201f)
                curveTo(10.3908f, 16.6801f, 10.7808f, 16.4901f, 10.9808f, 16.2901f)
                lineTo(12.9208f, 14.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1699f, 8.5801f)
                curveTo(12.6099f, 10.1501f, 13.8399f, 11.3901f, 15.4199f, 11.8301f)
            }
        }
        .build()
        return _messageedit!!
    }

private var _messageedit: ImageVector? = null
