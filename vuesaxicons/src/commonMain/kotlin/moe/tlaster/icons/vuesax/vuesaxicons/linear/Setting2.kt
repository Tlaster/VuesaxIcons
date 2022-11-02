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

public val LinearGroup.Setting2: ImageVector
    get() {
        if (_setting2 != null) {
            return _setting2!!
        }
        _setting2 = Builder(name = "Setting2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.8799f)
                verticalLineTo(11.1199f)
                curveTo(2.0f, 10.0799f, 2.85f, 9.2199f, 3.9f, 9.2199f)
                curveTo(5.71f, 9.2199f, 6.45f, 7.9399f, 5.54f, 6.3699f)
                curveTo(5.02f, 5.4699f, 5.33f, 4.2999f, 6.24f, 3.7799f)
                lineTo(7.97f, 2.7899f)
                curveTo(8.76f, 2.3199f, 9.78f, 2.5999f, 10.25f, 3.3899f)
                lineTo(10.36f, 3.5799f)
                curveTo(11.26f, 5.1499f, 12.74f, 5.1499f, 13.65f, 3.5799f)
                lineTo(13.76f, 3.3899f)
                curveTo(14.23f, 2.5999f, 15.25f, 2.3199f, 16.04f, 2.7899f)
                lineTo(17.77f, 3.7799f)
                curveTo(18.68f, 4.2999f, 18.99f, 5.4699f, 18.47f, 6.3699f)
                curveTo(17.56f, 7.9399f, 18.3f, 9.2199f, 20.11f, 9.2199f)
                curveTo(21.15f, 9.2199f, 22.01f, 10.0699f, 22.01f, 11.1199f)
                verticalLineTo(12.8799f)
                curveTo(22.01f, 13.9199f, 21.16f, 14.7799f, 20.11f, 14.7799f)
                curveTo(18.3f, 14.7799f, 17.56f, 16.0599f, 18.47f, 17.6299f)
                curveTo(18.99f, 18.5399f, 18.68f, 19.6999f, 17.77f, 20.2199f)
                lineTo(16.04f, 21.2099f)
                curveTo(15.25f, 21.6799f, 14.23f, 21.3999f, 13.76f, 20.6099f)
                lineTo(13.65f, 20.4199f)
                curveTo(12.75f, 18.8499f, 11.27f, 18.8499f, 10.36f, 20.4199f)
                lineTo(10.25f, 20.6099f)
                curveTo(9.78f, 21.3999f, 8.76f, 21.6799f, 7.97f, 21.2099f)
                lineTo(6.24f, 20.2199f)
                curveTo(5.33f, 19.6999f, 5.02f, 18.5299f, 5.54f, 17.6299f)
                curveTo(6.45f, 16.0599f, 5.71f, 14.7799f, 3.9f, 14.7799f)
                curveTo(2.85f, 14.7799f, 2.0f, 13.9199f, 2.0f, 12.8799f)
                close()
            }
        }
        .build()
        return _setting2!!
    }

private var _setting2: ImageVector? = null
