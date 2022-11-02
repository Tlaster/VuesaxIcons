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

public val LinearGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.17f, 10.0599f)
                horizontalLineTo(7.8299f)
                curveTo(6.65f, 10.0599f, 6.24f, 9.2699f, 6.93f, 8.3099f)
                lineTo(11.1f, 2.4699f)
                curveTo(11.59f, 1.77f, 12.41f, 1.77f, 12.89f, 2.4699f)
                lineTo(17.06f, 8.3099f)
                curveTo(17.76f, 9.2699f, 17.35f, 10.0599f, 16.17f, 10.0599f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.59f, 17.9999f)
                horizontalLineTo(6.42f)
                curveTo(4.84f, 17.9999f, 4.3f, 16.9499f, 5.23f, 15.6699f)
                lineTo(9.22f, 10.0599f)
                horizontalLineTo(14.79f)
                lineTo(18.78f, 15.6699f)
                curveTo(19.71f, 16.9499f, 19.17f, 17.9999f, 17.59f, 17.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(18.0f)
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
