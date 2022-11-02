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

public val BrokenGroup.Foldercloud: ImageVector
    get() {
        if (_foldercloud != null) {
            return _foldercloud!!
        }
        _foldercloud = Builder(name = "Foldercloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(8.5f)
                curveTo(10.0f, 2.0f, 10.33f, 2.44f, 10.9f, 3.2f)
                lineTo(12.4f, 5.2f)
                curveTo(12.78f, 5.7f, 13.0f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 6.0f, 22.0f, 7.0f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 22.0f, 2.0f, 21.0f, 2.0f, 17.0f)
                verticalLineTo(12.03f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.7605f, 18.3199f)
                curveTo(11.4105f, 18.4899f, 11.4105f, 21.8899f, 13.7605f, 22.0599f)
                horizontalLineTo(19.3205f)
                curveTo(19.9905f, 22.0599f, 20.6506f, 21.8099f, 21.1406f, 21.3599f)
                curveTo(22.7906f, 19.9199f, 21.9105f, 17.0399f, 19.7405f, 16.7699f)
                curveTo(18.9605f, 12.0799f, 12.1806f, 13.8599f, 13.7806f, 18.3299f)
            }
        }
        .build()
        return _foldercloud!!
    }

private var _foldercloud: ImageVector? = null
