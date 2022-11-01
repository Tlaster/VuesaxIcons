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

public val LinearGroup.Messageedit: ImageVector
    get() {
        if (_messageedit != null) {
            return _messageedit!!
        }
        _messageedit = Builder(name = "Messageedit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 8.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.91f, 7.8399f)
                lineTo(7.72f, 13.0299f)
                curveTo(7.52f, 13.2299f, 7.33f, 13.6199f, 7.29f, 13.8999f)
                lineTo(7.01f, 15.8799f)
                curveTo(6.91f, 16.5999f, 7.41f, 17.0999f, 8.13f, 16.9999f)
                lineTo(10.11f, 16.7199f)
                curveTo(10.39f, 16.6799f, 10.78f, 16.4899f, 10.98f, 16.2899f)
                lineTo(16.17f, 11.0999f)
                curveTo(17.06f, 10.2099f, 17.49f, 9.1699f, 16.17f, 7.8499f)
                curveTo(14.85f, 6.5199f, 13.81f, 6.9399f, 12.91f, 7.8399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.17f, 8.5798f)
                curveTo(12.61f, 10.1498f, 13.84f, 11.3898f, 15.42f, 11.8298f)
            }
        }
        .build()
        return _messageedit!!
    }

private var _messageedit: ImageVector? = null
