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

public val LinearGroup.Wallet2: ImageVector
    get() {
        if (_wallet2 != null) {
            return _wallet2!!
        }
        _wallet2 = Builder(name = "Wallet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                horizontalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.9699f)
                verticalLineTo(13.03f)
                curveTo(22.0f, 13.58f, 21.56f, 14.0299f, 21.0f, 14.0499f)
                horizontalLineTo(19.0399f)
                curveTo(17.9599f, 14.0499f, 16.97f, 13.2599f, 16.88f, 12.1799f)
                curveTo(16.82f, 11.5499f, 17.0599f, 10.9599f, 17.4799f, 10.5499f)
                curveTo(17.8499f, 10.1699f, 18.36f, 9.95f, 18.92f, 9.95f)
                horizontalLineTo(21.0f)
                curveTo(21.56f, 9.9699f, 22.0f, 10.4199f, 22.0f, 10.9699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.48f, 10.55f)
                curveTo(17.06f, 10.96f, 16.82f, 11.55f, 16.88f, 12.18f)
                curveTo(16.97f, 13.26f, 17.96f, 14.05f, 19.04f, 14.05f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.5f)
                curveTo(21.0f, 18.5f, 19.0f, 20.5f, 16.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 18.5f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.78f, 3.64f, 3.88f, 6.19f, 3.56f)
                curveTo(6.45f, 3.52f, 6.72f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(16.0f)
                curveTo(16.26f, 3.5f, 16.51f, 3.51f, 16.75f, 3.55f)
                curveTo(19.33f, 3.85f, 21.0f, 5.76f, 21.0f, 8.5f)
                verticalLineTo(9.95f)
                horizontalLineTo(18.92f)
                curveTo(18.36f, 9.95f, 17.85f, 10.17f, 17.48f, 10.55f)
                close()
            }
        }
        .build()
        return _wallet2!!
    }

private var _wallet2: ImageVector? = null
