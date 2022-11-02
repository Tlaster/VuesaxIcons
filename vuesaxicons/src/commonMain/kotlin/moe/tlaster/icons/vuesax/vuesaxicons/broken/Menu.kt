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

public val BrokenGroup.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5401f, 8.3099f)
                curveTo(18.8987f, 8.3099f, 20.0001f, 7.2085f, 20.0001f, 5.8499f)
                curveTo(20.0001f, 4.4913f, 18.8987f, 3.3899f, 17.5401f, 3.3899f)
                curveTo(16.1814f, 3.3899f, 15.0801f, 4.4913f, 15.0801f, 5.8499f)
                curveTo(15.0801f, 7.2085f, 16.1814f, 8.3099f, 17.5401f, 8.3099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.92f, 5.8499f)
                curveTo(8.92f, 4.4899f, 7.82f, 3.3899f, 6.46f, 3.3899f)
                curveTo(5.1f, 3.3899f, 4.0f, 4.4899f, 4.0f, 5.8499f)
                curveTo(4.0f, 7.2099f, 5.1f, 8.3099f, 6.46f, 8.3099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5401f, 20.62f)
                curveTo(18.9001f, 20.62f, 20.0001f, 19.52f, 20.0001f, 18.16f)
                curveTo(20.0001f, 16.8f, 18.9001f, 15.7f, 17.5401f, 15.7f)
                curveTo(16.1801f, 15.7f, 15.0801f, 16.8f, 15.0801f, 18.16f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.46f, 20.6099f)
                curveTo(7.8186f, 20.6099f, 8.92f, 19.5086f, 8.92f, 18.1499f)
                curveTo(8.92f, 16.7913f, 7.8186f, 15.6899f, 6.46f, 15.6899f)
                curveTo(5.1014f, 15.6899f, 4.0f, 16.7913f, 4.0f, 18.1499f)
                curveTo(4.0f, 19.5086f, 5.1014f, 20.6099f, 6.46f, 20.6099f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null
