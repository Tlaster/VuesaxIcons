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

public val BrokenGroup.Warning2: ImageVector
    get() {
        if (_warning2 != null) {
            return _warning2!!
        }
        _warning2 = Builder(name = "Warning2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.75f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.9199f, 8.58f)
                curveTo(2.9199f, 7.46f, 3.5199f, 6.42f, 4.4899f, 5.85f)
                lineTo(10.4299f, 2.42f)
                curveTo(11.3999f, 1.86f, 12.6f, 1.86f, 13.58f, 2.42f)
                lineTo(19.52f, 5.85f)
                curveTo(20.49f, 6.41f, 21.09f, 7.45f, 21.09f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.09f, 16.54f, 20.49f, 17.58f, 19.52f, 18.15f)
                lineTo(13.58f, 21.58f)
                curveTo(12.61f, 22.14f, 11.4099f, 22.14f, 10.4299f, 21.58f)
                lineTo(4.4899f, 18.15f)
                curveTo(3.5199f, 17.59f, 2.9199f, 16.55f, 2.9199f, 15.42f)
                verticalLineTo(12.66f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.2f)
                verticalLineTo(16.2999f)
            }
        }
        .build()
        return _warning2!!
    }

private var _warning2: ImageVector? = null
